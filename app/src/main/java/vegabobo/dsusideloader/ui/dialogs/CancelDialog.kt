package vegabobo.dsusideloader.ui.dialogs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Cancel
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import vegabobo.dsusideloader.R
import vegabobo.dsusideloader.ui.components.Dialog

@Composable
fun CancelDialog(
    onClickConfirm: () -> Unit,
    onClickCancel: () -> Unit,
) {
    Dialog(
        title = stringResource(id = R.string.cancel),
        icon = Icons.Outlined.Cancel,
        text = stringResource(id = R.string.cancel_description),
        confirmText = stringResource(id = R.string.yes),
        cancelText = stringResource(id = R.string.no),
        onClickConfirm = onClickConfirm,
        onClickCancel = onClickCancel
    )
}